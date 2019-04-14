package com.epam.audio;

import com.epam.audio.controller.Controller;
import com.epam.audio.view.ViewConsole;

//        Звукозапись. Определить иерархию музыкальных композиций. Записать на диск
//        сборку. Посчитать продолжительность. Провести перестановку композиций диска на
//        основе принадлежности к стилю. Найти композицию, соответствующую заданному
//        диапазону длины треков.


public class main {

    public static void main(String[] args) {
        Controller controller = new Controller(new ViewConsole());
        controller.startProgram();

    }
}
