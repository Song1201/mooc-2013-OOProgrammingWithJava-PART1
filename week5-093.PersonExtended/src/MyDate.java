
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        MyDate earlier;
        MyDate later;
        if (this.year<comparedDate.year) {
            earlier = this;
            later = comparedDate;            
        } else if(this.year==comparedDate.year && this.month<
                comparedDate.month) {
            earlier = this;
            later = comparedDate;  
        } else if(this.year==comparedDate.year && this.month==comparedDate.month
                && this.day<comparedDate.day) {
            earlier = this;
            later = comparedDate;
        } else {
            later = this;
            earlier = comparedDate;
        }
        
        int yearDiff = later.year -  earlier.year;
        if (later.month<earlier.month || (later.month==earlier.month && 
                later.day<earlier.day)) {
            yearDiff--;
        }
        return yearDiff;
    }

  
}
