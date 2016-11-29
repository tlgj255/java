public class gubun {
	static int e=0,g = 0,as = 0,temp__;
	static int [][]d = 
		   {{0,0,1,0,1,1,0},
		 	{1,0,1,0,0,0,0},
		 	{1,0,0,0,1,1,1},
		 	{1,1,0,0,1,0,0},
		 	{0,0,0,1,1,1,0},
		 	{0,1,1,0,0,1,0},
		 	{1,1,0,0,0,1,0}};
	static int f[] = new int [d.length];
	static int grup = 0,ex = 0,temp,temp2,q = 0;
	static boolean ch = false;
public static void main(String[] args) {
gubun gu = new gubun();
	int [][]a =  {{0,0,1,0,1,1,0},
		 	{1,0,1,0,0,0,0},
		 	{1,0,0,0,1,1,1},
		 	{1,1,0,0,1,0,0},
		 	{0,0,0,1,1,1,0},
		 	{0,1,1,0,0,1,0},
		 	{1,1,0,0,0,1,0}};
	int count = 0,c = 0,b = 0;
while(true){	
	if(c == 7){
		c = 0;
		b++;
	}
	if(b == 7)break;
	if(a[c][b] == 1)
		count++;
	if(d[c][b] == 1){
		gu.get(c,b);
		
	}
c++;
}
System.out.println("1의 계수"+count);
System.out.println("그룹의 수"+grup);
for(int i = 0; i < g; i++){
	System.out.print(f[i]+" ");
}
System.out.println();
}
public static void get(int c,int b){	
	e = 1;
	d[c][b] = 0;
	ch = false;
	while(true){
		if(ch == true)break;
		ch = true;
		while(true)
	if(b-1 >= 0&&d[c][b-1]== 1){
		e++;
		if(c+1 <= 6&&d[c+1][b] == 1||b+1 <= 6&&d[c][b+1] == 1||c-1 >= 0&&d[c-1][b] == 1){
			temp = c;temp2 = b; q = 1;}
		ch = false;
		b--;
		d[c][b] = 0;
	}else break;
	if(q == 1&&ch == true){
		c = temp; 
		b = temp2;
		q = 0;}
	while(true)
	if(b+1 <= 6&&d[c][b+1] == 1){
		e++;
		if(c+1 <= 6&&d[c+1][b] == 1||b-1 >= 0&&d[c][b-1] == 1||c-1 >= 0&&d[c-1][b] == 1){
			temp = c;temp2 = b; q = 1;}
		ch = false;
		b++;
		d[c][b] = 0;
	}else break;
	if(q == 1&&ch == true){
		c = temp; 
		b = temp2;
		q = 0;}
	while(true)
		if(c-1 >= 0&&d[c-1][b] == 1){
			e++;
			if(c+1 <= 6&&d[c+1][b] == 1||b+1 <= 6&&d[c][b+1] == 1||b-1 >= 0&&d[c][b-1] == 1){
				temp = c;temp2 = b; q = 1;}
			ch = false;
			c--;
			d[c][b] = 0;
		}else
			break;
		if(q == 1&&ch == true){
			c = temp; 
			b = temp2;
			q = 0;}
		while(true)
			if(c+1 <= 6&&d[c+1][b] == 1){
				e++;
				if(c-1 >= 0&&d[c-1][b] == 1||b+1 <= 6&&d[c][b+1] == 1||b-1 >= 0&&d[c][b-1] == 1){
					temp = c;temp2 = b; q = 1;}
				ch = false;
				c++;
				d[c][b] = 0;
			}else break;
				if(q == 1&&ch == true){
					c = temp; 
					b = temp2;
					q = 0;}
	}
	f[g] = e;
	as = g;
	for (int j = g; j >=0; j--) {
        if (f[as] < f[j]) {
            temp__ = f[as];
            f[as] = f[j];
            f[j] = temp__;
            as--;
        }
    }
	g++;
	grup++;
	}
}