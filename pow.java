
class pow {
    public int calc(int a,int b){
        int res;
        if(b==0){
            return 1;
        }
        else{
            res = a * (calc(a,b-1));
            return res;
        }
    }
}