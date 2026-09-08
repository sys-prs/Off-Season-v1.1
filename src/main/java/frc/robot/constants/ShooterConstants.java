package frc.robot.constants;

/*
 * 7 motores
 * 4 con poleas hacia los rodillos (2 derechos, 2 izquierdos),
 * 2 motores inferiores que funcionan como feeder (1 derecho, 1 izquierdo)
 * 1 motor conectado a una polea que hace girar los rodillos superiores (1 derecho)
 * ! no creo que sea necesario definir pid para el shooter
 * ! por defecto, siempre el motor izquierdo seguirá al derecho, y el derecho será el que se controle
 * ! por defecto, los motores inferiores seguiran al motor superior, y el motor superior será el que se controle
 * ! falta definir limites de voltage, pero eso se lo encargo a sebas
 */

public class ShooterConstants {
    public class RIGHT_MOTORS {
        public static final int TOP_ID = 4;
        public static final int BOTTOM_ID = 5;

        public static final double SET_SPEED = 0.0;
        public static final double SET_VOLTAGE = 0.0;

        public static final boolean INVERTED = false;
        public static final boolean TOP_FOLLOWS_BOTTOM = true;
    }

    public class LEFT_MOTORS {
        public static final int TOP_ID = 6;
        public static final int BOTTOM_ID = 7;

        public static final double SET_SPEED = 0.0;
        public static final double SET_VOLTAGE = 0.0;

        public static final boolean INVERTED = false;
        public static final boolean FOLLOWER_INVERTED = false;
        public static final boolean TOP_FOLLOWS_BOTTOM = true;
    }

    public class FEEDER_MOTORS {
        public static final int RIGHT_ID = 8;
        public static final int LEFT_ID = 9;
        
        public static final double SET_SPEED = 0.0;
        public static final double SET_VOLTAGE = 0.0;

        public static final boolean INVERTED = false;
        public static final boolean FOLLOWER_INVERTED = false;
        public static final boolean LEFT_FOLLOWS_RIGHT = true;
    }

    public class ROLLER_MOTOR {
        public static final int ID = 10;
        public static final boolean INVERTED = false;

        public static final double SET_SPEED = 0.0;
        public static final double SET_VOLTAGE = 0.0;
    }
}
