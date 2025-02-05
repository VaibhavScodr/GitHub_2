public class index{
   public static void main(String... args) {
      String v="abcabcdbb";
      int ans=lcp(v);
      System.out.println(ans);
   }
   static int lcp(String s){
      int len=0;
      int map[]=new int[256];
      for(int num:s.toCharArray()) {
         map[num]++;
      }
      int l=0;
      int r=0;
      int n=s.length();
      while(r<n){
         if(map[s.charAt(r)]>0) {
            if(map[s.charAt(r)]>=l) {
               l=map[s.charAt(r)]+1;
               len=Math.max(len,r-l+1);
               map[s.charAt(r)]=r;
            }
            else{
               map[s.charAt(r)]=1;
            }
            len=Math.max(len,r-l+1);
            r++;
         }
      }
      return len;
   }
}