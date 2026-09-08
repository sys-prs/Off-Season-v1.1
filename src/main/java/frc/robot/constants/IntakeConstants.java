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
        public static final int ID = 1; //ID de motor
        public static final boolean INVERTED = false; // Si esta invertido o no
        public static final double VOLTAGE = 0.0; // Voltaje a enviar

        public static final double AmperageLowerLimit=0;
        public static final double AmperageLimit=0;
        public static final double AmperageLimitTime=0;
        public static final double AmperageLimitSteer=0;

    }

    public class LEFT_MOTOR {
        public static final int ID = 2; //ID motor
        public static final boolean INVERTED = true; //Si esta invertido o no
        public static final boolean FOLLOW_RIGHT = true; //Que va a ser un follower del RIGHT MOTOR
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

        public static final double kS = 0.0;
        public static final double g = 0.0;
        public static final double kA = 0.0;
        public static final double kV = 0.0;

        public static final double MotionA = 0.0;
        public static final double MotionV = 0.0;
        public static final double MotionJ = 0.0;
        
        public static final double GearRatio=0;

        public static final double AmperageLowerLimit=0;
        public static final double AmperageLimit=0;
        public static final double AmperageLimitTime=0;
        public static final double AmperageLimitSteer=0;

        public static final double Quostatic = 3;
        public static final double Dynamic = 3;
    }
}
