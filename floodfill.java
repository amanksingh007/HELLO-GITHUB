import java.util.*;

class floodfill {
    public static boolean dfs(int sx,int sy,int dx,int dy,int arr[][],boolean visited[][]){
		System.out.println(sx+" "+sy);
        if(sx==dx && sy==dy)
          return true;
        if(sx<1 || sx>dx || sy<1 || sy>dy)
          return false;
        if(visited[sx][sy]==true|| arr[sx][sy]==0)
          return false;
        visited[sx][sy]=true;
        if(dfs(sx+1,sy,dx,dy,arr,visited))
			return true;
		if(dfs(sx-1,sy,dx,dy,arr,visited))
			return true;
		if(dfs(sx,sy+1,dx,dy,arr,visited))
			return true;
		if(dfs(sx,sy-1,dx,dy,arr,visited))
			return true;
		return false;
    }
    
    public static void main(String args[] ) throws Exception {
      
      Scanner sc=new Scanner(System.in);
      int arr[][]=new int [20][20];
      boolean visited[][]=new boolean[20][20];
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=1;i<=n;i++)
      for(int j=1;j<=m;j++)
      arr[i][j]=sc.nextInt();
      if(dfs(1,1,n,m,arr,visited))
      System.out.println("Yes");
      else
      System.out.println("No");
      
    }
}
