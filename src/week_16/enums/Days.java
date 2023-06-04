package week_16.enums;

public enum Days {
    Monday("MONDAY",1), Tuesday("TUESDAY",2), Wednesday("WEDNESDAY",3), Thursday("THURSDAY",4), Friday("FRIDAY",5), Saturday("SATURDAY",6), Sunday("SUNDAY",7);

    String value;
    int numOfDay;

    Days(String value, int numOfDay) {
        this.value = value;
        this.numOfDay = numOfDay;
    }


}
