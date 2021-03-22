package ClasesAutomatas;

import java.util.TimerTask;
import javax.swing.*;
/**
 *
 * @author ricky
 */
public class MovimientoAutomata {
    public JLabel flecha;
    public JLabel automata;
    
    public MovimientoAutomata(JLabel a, JLabel f) {
        this.flecha = f;
        this.automata = a;
    }
    
    public TimerTask derechaAbajo() {
        TimerTask derechaAbajo = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()-30, flecha.getY()+20);
                try {
                    Thread.sleep(300);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
        
        return derechaAbajo;
    }
    
        public TimerTask abajoIzquierda() {
            TimerTask abajoIzquierda = new TimerTask() {
                public void run() {
                    flecha.setLocation(flecha.getX()-20, flecha.getY()-20);
                    try {
                        Thread.sleep(300);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
            };
            
            return abajoIzquierda;
        }
        public TimerTask izquierdaArriba() {
            TimerTask izquierdaArriba = new TimerTask() {
                public void run() {
                    flecha.setLocation(flecha.getX()+20, flecha.getY()-20);
                    try {
                        Thread.sleep(300);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
            };
        return izquierdaArriba;
        }
        public TimerTask arribaDerecha() {
            TimerTask arribaDerecha = new TimerTask() {
                public void run() {
                    flecha.setLocation(flecha.getX()+30, flecha.getY()+20);
                    try {
                        Thread.sleep(300);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
            };
            
            return arribaDerecha;
        }
        
        
        public TimerTask irDerecha(int pasos) {
            TimerTask irDerecha = new TimerTask() {
                public void run() {
                    for(int i=0; i<pasos; i++){
                        automata.setLocation(automata.getX()+45, automata.getY());
                        flecha.setLocation(flecha.getX()+45, flecha.getY());
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }   
                    }

                }
            };
            return irDerecha;
        }
        
        
        public TimerTask irAbajo(int pasos) {
            TimerTask irAbajo = new TimerTask() {
                public void run() {
                    for(int i=0; i<pasos; i++){
                        automata.setLocation(automata.getX(), automata.getY()+39);
                        flecha.setLocation(flecha.getX(), flecha.getY()+39);
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }   
                    }

                }
            };
            
            return irAbajo;
        }
}
