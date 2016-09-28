public class MyDate {
    private int day;
    private int month;
    private int year;
    public void advance(int num) {
        day=day+num;
        if(this.day>30) {
            for(int i=0;i<day/30;i++){
                month++;
                this.day=day%30;
            }
        }
        if(this.month>12) {
            for(int i=0;i<month/12;i++){
                year++;
                this.month=month%12+1;
            }
        }
    }
    public void advance() {
        day=day+5;
        if(this.day>30) {
            for(int i=0;i<day/30;i++){
                month++;
                this.day=day%30;
            }
        }
        if(this.month>12) {
            for(int i=0;i<month/12;i++){
                year++;
                this.month=month%12+1;
            }
        }
    }
    public MyDate(int day, int month, int year) {
        this.day = day;
        if(this.day>30) {
            for(int i=0;i<day/30;i++){
                month++;
                this.day=day%30;
            }
        }
        this.month = month;
        if(this.month>12) {
            for(int i=0;i<month/12;i++){
                year++;
                this.month=month%12+1;
            }
        }
        this.year = year;
    }
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    public boolean earlier(MyDate compared) {
        if ( this.year < compared.year ) {
            return true;
        }
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }
        return false;
    }
    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(this.day+days, this.month, this.year);
        return newMyDate;
    }
   public  int differenceInYears(MyDate first) {
        if(this.year<first.year) {
            if(this.month>first.month) {
                return Math.abs(this.year-first.year)-1;
            }
            if(this.month==first.month) {
                if(first.day>this.day) {
                    return Math.abs(this.year-first.year);
                }
                return Math.abs(this.year-first.year);
            }
            return Math.abs(this.year-first.year);
        }
        if(this.year>first.year) {
            if(first.month>this.month) {
                return Math.abs(this.year-first.year)-1;
            }
            if(this.month==first.month) {
                if(this.day>first.day) {
                    return Math.abs(this.year-first.year);
                }
                return Math.abs(this.year-first.year);
            }
            return Math.abs(this.year-first.year);
        }
        if(this.year+1==first.year || this.year-1==first.year) {
            if(this.month+first.month-1/12>0) {
                return 0;
            }
        }
        return Math.abs(first.year-this.year);
    }
}