package examples;
import com.toedter.calendar.JDateChooser;
import org.jdatepicker.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        // Crear el marco de la aplicación
        JFrame frame = new JFrame("Ejemplo de JCalendar con LocalDate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Crear un selector de fecha (JDateChooser)
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MM-yyyy");

        // Crear un botón para capturar la fecha
        JButton button = new JButton("Obtener Fecha");

        // Crear un label para mostrar la fecha seleccionada
        JLabel label = new JLabel();

        // Acción al presionar el botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date selectedDate = dateChooser.getDate();
                if (selectedDate != null) {
                    // Convertir Date a LocalDate
                    LocalDate localDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    
                    // Formatear la fecha con DateTimeFormatter
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formattedDate = localDate.format(formatter);
                    
                    label.setText("Fecha seleccionada: " + formattedDate);
                    System.out.println( "Dia Semana: " + localDate.getDayOfWeek());    // Dia de la Semana;
                } else {
                    label.setText("No se ha seleccionado una fecha.");
                }
            }
        });

        // Añadir componentes al marco
        frame.add(dateChooser);
        frame.add(button);
        frame.add(label);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
