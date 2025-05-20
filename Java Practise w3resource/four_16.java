public class four_16 {
    public static void main(String[] args) {
        int x=0,sum=2;
        int ans;
        for(int i=3;i<=10000000;i++)
        {   ans=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
            {ans++;
                break;}
        }
            if(ans==0)
            {
            sum+=i;
            x++;
        }
        if(x==99)
        break;

        }
        System.out.println(sum);

    }
}
