package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int rounded;
        if ((int)(numberToBeRounded + 0.5) > (int)numberToBeRounded)
            rounded = (int)numberToBeRounded + 1;
        else rounded = (int)numberToBeRounded;
        System.out.println(rounded);
    }
}
