public class AllPatterns {

    public static void main(String[] args){
        //Alphabet pattern
        int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                int a=col;
                int b='A'-1;
                int ans=a+b;
                char finalAns=(char)ans;
                System.out.print(finalAns+" ");
            }
            for(int col=1;col<=row-1;col++){
                char toPrint=(char)(row+'A'-2);
                System.out.print(toPrint+" ");
                toPrint--;
            }
            System.out.println();
    }
System.out.println("  ");
    //Alphabet triangle
    for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                int a=col;
                int b=('A'-1);
                int ans=a+b;
                char FinalAns=(char)ans;
                System.out.print(FinalAns+" ");
            }
            System.out.println();
        } 
System.out.println();
        //Hollow rectangle
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1||row==n){
                    System.out.print("* ");
                }else{
                    System.out.print("* ");
                    
                    
                }
            }
            System.out.println();
        }
System.out.println();
        //inverted alphabet triangle
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                int a=n-col;
                int b='A';
                int ans=a+b;
                char FinalAns=(char)ans;
                System.out.print(FinalAns+" ");
            }
            System.out.println();
        }
System.out.println();
        //inverted pyramid
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*(n-row)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //number pyramid
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            int rowValue=row;
            int decRowValue=row-1;
            for(int col=1;col<=row-1;col++){
                System.out.print(decRowValue+" ");
                decRowValue--;
          }
          System.out.println();
        }
System.out.println();
        //number triangle
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
System.out.println();
        //parallelogram
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //reverse triangle
        for(int row=1; row<=n ;row++){
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            for(int col=1; col<=2*n-2*row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //right triangle
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //row triangle
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
System.out.println();
        //solid square
                for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //triangle.java
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //unique.java
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            for(int col=1;col<=2*(n-row);col++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            for (int col=1;col<=2*(row-1);col++){
                System.out.print("  ");
            }
            for(int col=1;col<= n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
    }    
System.out.println();
            //uppper right 
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
}}