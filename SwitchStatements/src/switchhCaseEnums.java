

public class switchhCaseEnums {
    public enum fingerNumber{
        one,two,three,four,five
    }
    public static void main (String[]args){
        //Declare variables
        fingerNumber number =fingerNumber.four;
        String functionOfFingers;
        switch (number){
            case one:
                functionOfFingers ="say yes";
                break;
            case two:
                functionOfFingers ="point at people";
                break;
                case three:
                    functionOfFingers ="be longer than all the other fingers";
                    break;
                    case four:
                        functionOfFingers ="wear rings";
                        break;
                        case five:
                            functionOfFingers ="be the shorter than all the other fingers";
                            break;
                            default:
                                functionOfFingers ="nothing at all";
                                break;
        }

        System.out.println(functionOfFingers);
    }
}
