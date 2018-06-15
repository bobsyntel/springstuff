import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Moon {

    public static  void main(String[] args){
//        GregorianCalendar calendar = new GregorianCalendar();
//        System.out.println(calendar);
        int count = numberOfBlueMoons(2000,0,1,0,0,2999);
        System.out.println(count);
        reverseString("man");
    }

    static int numberOfBlueMoons(int startYear, int startMonth, int startDate, int startHour,
                                 int startMinute,int endYear){

        int  blueMoonCount = 0;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(startYear,startMonth,startDate,startHour,startMinute);
//        System.out.println(calendar);
        while(calendar.get(GregorianCalendar.YEAR) <= endYear){
            int prevMonth = calendar.get(GregorianCalendar.MONTH);
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 29);
            calendar.add(GregorianCalendar.HOUR,12);
            calendar.add(GregorianCalendar.MINUTE,44);

            if(prevMonth == calendar.get(GregorianCalendar.MONTH)){
                blueMoonCount++;
            }
        }
//        System.out.println(calendar.get(GregorianCalendar.DAY_OF_YEAR));
        return blueMoonCount;
    }

    public static void reverseString(String s1) {
        StringBuilder noSpecialChar = new StringBuilder(s1.replaceAll("\\W", " "));
        StringTokenizer st = new StringTokenizer(noSpecialChar.toString());
//        while(st.hasMoreElements()) {
//            String token = st.nextToken();
//            StringBuilder sb = new StringBuilder(token);
//            s1 = s1.replace(token, sb.reverse());
//        }​
//        System.out.println(s1);
        while(st.hasMoreElements()){
            String token = st.nextToken();
            StringBuilder sb = new StringBuilder(token);
            s1 = s1.replace(token,sb.reverse());
        }
        System.out.println(s1);
    }


}
