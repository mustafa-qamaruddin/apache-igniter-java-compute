package org.qubits;

import org.qubits.utils.IgniteApp;

public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello, Apache Ignite!" );
        new IgniteApp().computeIgnite();
    }
}
