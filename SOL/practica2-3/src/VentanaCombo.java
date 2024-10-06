/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enri
 */

import javax.swing.*;

public class VentanaCombo extends ventana {

    public VentanaCombo() {
        // Configuración básica de la ventana
        setTitle("Ventana con Look and Feel de Windows");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Agregamos algún componente para ver el cambio visual
        JButton boton = new JButton("Botón de ejemplo");
        add(boton);
    }

    public static void main(String[] args) {
        // Cambiar el Look and Feel al de Windows
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear la ventana
        VentanaCombo ventana = new VentanaCombo();
        ventana.setVisible(true);
    }
}
