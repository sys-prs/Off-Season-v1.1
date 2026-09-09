package frc.robot.constants;

/*
 * ! el transfer es lo mismo que el feeder, solo hice el ajuste al nombre para facilidad de lectura
 * 2 motores,
 * 2 para el feeder inferior,
 * ! no necesitamos definir pid para el feeder
 * ! falta definir limites de voltage, pero eso se lo encargo a sebas
 */

public class TransferConstants {
    public class RIGHT_MOTOR {
        public static final int ID = 11;
        public static final boolean INVERTED = false;
        
        public static final double AmperageLowerLimit=0;
        public static final double AmperageLimit=0;
        public static final double AmperageLimitTime=0;
        public static final double AmperageLimitSteer=0;
    }

    public class LEFT_MOTOR {
        public static final int ID = 12;
        public static final boolean INVERTED = true;
        public static final boolean FOLLOW_RIGHT = true;
        
        public static final double AmperageLowerLimit=0;
        public static final double AmperageLimit=0;
        public static final double AmperageLimitTime=0;
        public static final double AmperageLimitSteer=0;
    }
}
