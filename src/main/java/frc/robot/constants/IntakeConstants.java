package frc.robot.constants;

/* 
 * 3 motores,
 * 2 motores para succionar,
 * 1 motor para brazo 
 * 
 * ! falta definir las IDs
 * ! por defecto, siempre el motor izquierdo seguirá al derecho, y el derecho será el que se controle
 * ! falta definir limites de voltage, pero eso se lo encargo a sebas
 * 
 */

public class IntakeConstants {
    public class RIGHT_MOTOR {
        public static final int ID = 1;
        public static final boolean INVERTED = false;
        public static final double SET_SPEED = 0.0;
        public static final double SET_VOLTAGE = 0.0;

        public static final double p = 0.0;
        public static final double i = 0.0;
        public static final double d = 0.0;
    }

    public class LEFT_MOTOR {
        public static final int ID = 2;
        public static final boolean INVERTED = true;
        public static final boolean FOLLOW_RIGHT = true;
        public static final boolean FOLLOWER_INVERTED = false;
        //no es necesario definir un pid para el motor izquierdo
    }

    public class ARM_MOTOR {
        public static final int ID = 3;
        public static final boolean INVERTED = false;
        public static final double SET_SPEED = 0.0;
        public static final double SET_VOLTAGE = 0.0;

        public static final double p = 0.0;
        public static final double i = 0.0;
        public static final double d = 0.0;
    }
}
