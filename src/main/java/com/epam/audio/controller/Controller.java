package com.epam.audio.controller;


import com.epam.audio.controller.util.CompositionUtil;
import com.epam.audio.controller.util.DurationUtil;
import com.epam.audio.controller.util.SearchUtil;
import com.epam.audio.controller.util.SortUtil;
import com.epam.audio.model.entity.Disc;
import com.epam.audio.model.entity.MusicComposition;
import com.epam.audio.view.ViewConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Controller {

    private boolean stopReading = true;
    private ViewConsole view;

    public Controller(ViewConsole view) {
        this.view = view;
    }

    public void startProgram(){

        CompositionUtil.init();

        view.printMessage("Hello! Chose your compositions by numbers below to burn on Disk");
        view.printMessage("Note : Press double enter or invalid composition number to start burning");
        view.printMessage("------------------------------------------------------------------");

        printCompositions();

        Disc disc = new Disc();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (stopReading) {
                String compositionNumber = reader.readLine();
                if (inputCheck(compositionNumber)){
                disc.addComposition(CompositionUtil.getCompositionCollection().get(compositionNumber));
                }
                else stopReading = false;
            }
            view.printMessage("Composition successfully burned on disk");
            view.printMessage("Here is your composition collection on a disc:");
            view.printMessage("------------------------------------------------------------------");

            printCompositionsOnDisk(disc);
            view.printMessage(DurationUtil.calculateTotalDuration(disc));
            view.printMessage("------------------------------------------------------------------");

            view.printMessage("Here is your composition collection on a disc sorted by style");
            view.printMessage("------------------------------------------------------------------");

            SortUtil.sortCollection(disc);
            printCompositionsOnDisk(disc);
            view.printMessage(DurationUtil.calculateTotalDuration(disc));

            view.printMessage("------------------------------------------------------------------");
            view.printMessage("Please chose min and max duration in seconds if you want to find composition by duration:");

                String min = reader.readLine();
                String max = reader.readLine();
                printFoundCompositions(SearchUtil.findCompositionsByDuration(Integer.parseInt(min),Integer.parseInt(max),disc));
            }
            catch (IOException e) {
                view.printError("Unexpected error");

            }

            view.printMessage("Enjoy your music playlist =)");


        }



    public boolean inputCheck(String input) {

        return CompositionUtil.getCompositionCollection().containsKey(input);
    }


    public void printFoundCompositions(List<MusicComposition> found){
        for (MusicComposition composition : found) {
            System.out.println(composition.getPerformerName() + " - " + composition.getCompositionName() + " Duration: " + composition.getDuration());
        }
    }
    public void printCompositionsOnDisk(Disc disc){
        for (MusicComposition composition : disc.getUserCollection()) {
            System.out.println(composition.getPerformerName() + " - " + composition.getCompositionName());
        }
    }
    public void printCompositions() {
        Map<String, MusicComposition> map = CompositionUtil.getCompositionCollection();
        for (Map.Entry<String, MusicComposition> entry : map.entrySet()) {
            System.out.println(" " + entry.getKey() + ". " + entry.getValue().getPerformerName()+ " - " + entry.getValue().getCompositionName());
        }
    }
}
