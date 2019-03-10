import java.util.*;

public class FloatCasting {
      public static void main(String[] args) {

      float v1 = 102;
      float v2 = (int) 102.0;
//      float v3 = 1f * 0.0; // incompatible types: possible lossy conversion from double to float
      float v4 = 1f * (short)0.0;
//      float v5 = 1f* (boolean)0; //int cannot be converted to boolean

  }
}
