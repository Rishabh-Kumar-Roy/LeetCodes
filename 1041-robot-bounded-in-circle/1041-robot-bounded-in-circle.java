class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0;
        int d=0;
        for(char c:instructions.toCharArray())
        {
            switch(c)
            {
                case 'G':
                
                    if(d==0)
                    y++;
                    if(d==1)
                    x++;
                    if(d==2)
                    y--;
                    if(d==3)
                    x--;
                    break;
                

                case 'L':
                d=(d+3)%4;
                break;

                case 'R':
                d=(d+1)%4;
                break;
            }
        }

        return((x==0&&y==0)|| (d!=0));

    }
}