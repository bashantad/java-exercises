public enum Direction
{
   S,
   N,
   W,
   E;
   public static Direction opposite(Direction dir)
   {
      if(dir == S)
      {
         return N;
      }
      else if( dir == N)
      {
         return S;
      }
      else if( dir == W)
      {
         return E;
      }
      else if(dir == E)
      {
         return W;
      } else {
         return null;
         }
   }
}
