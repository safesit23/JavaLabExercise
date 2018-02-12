public class ZodiacYear {

    public static String[] zodiacYear(int[] year){
        String[] zodiacName= new String[year.length];
        int calYear;
        for(int i=0;i<year.length;i++){
            if(year[i]>=2500){
                year[i]=year[i]-543;
            }
            calYear=year[i]%12;
            switch(calYear){
            case 0: zodiacName[i]="monkey"; break;
            case 1: zodiacName[i]="rooster"; break;
            case 2: zodiacName[i]="dog"; break;
            case 3: zodiacName[i]="pig"; break;
            case 4: zodiacName[i]="rat"; break;
            case 5: zodiacName[i]="ox"; break;
            case 6: zodiacName[i]="tiger"; break;
            case 7: zodiacName[i]="rabbit"; break;
            case 8: zodiacName[i]="dragon"; break;
            case 9: zodiacName[i]="snake"; break;
            case 10:zodiacName[i]="horse"; break;
            case 11:zodiacName[i]="sheep"; break;
            default:zodiacName[i]="None";
            }

        }
        return zodiacName;
    }
}
