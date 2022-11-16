import java.util.Scanner;

public class MainFour {
    
    public MainFour() {
        
    }
    private String store = "";
    
    private String[][] board = new String[][] {{"_","_","_","_","_","_","_"},//1
                                       {"_","_","_","_","_","_","_"},//2
                                       {"_","_","_","_","_","_","_"},//3
                                       {"_","_","_","_","_","_","_"},//4
                                       {"_","_","_","_","_","_","_"},//5
                                       {"_","_","_","_","_","_","_"},//6                                                           
    };
    private int placedpieces;
    
    private String player = "x";
    private int X = 5;
    
    public String showBoard() {
    String s = "";  
    
    for(int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
        s+= board[i][j] + " ";  
        }
        s+= "\n";
    }
    
    return s;
    }
    
    public String[][] placePiece(int Y){
    X = 5;
    Y--;
    
    if((board[X][Y] != "x" & board[X][Y] != "o")) {
 
        board[X][Y] = player;
    
        
    } else {
        while((board[X][Y] == "x" || board[X][Y] == "o")) {
            if(X < 0) {
                X = 5;
                if(player == "x") {
                    player = "o";   
                    }else {
                    player = "x";   
                    }
                return board;
            }
        X--;    
        }
    
        board[X][Y] = player;
        
    }
    X = 5;
    
    if(player == "x") {
    player = "o";   
    }else {
    player = "x";   
    }
    placedpieces++;
    return board;   
    }
    
    public boolean detectWin() {    
    boolean b = false;
    
    for(int i = 0; i < 6; i++) {
        for(int j = 0; j < 7; j++) {
         store += board[i][j];
         if(store.contains("xxxx") || store.contains("oooo")) {
         return true;
         }
        }
        store = "";
    }
    
    for(int i = 0; i < 7; i++) {
        for(int j = 0; j < 6; j++) {
         store+=board[j][i];    
         if(store.contains("xxxx") || store.contains("oooo")) {
        
         return true;
         }
        }
        store = "";
    }
    
    int X = 0;
    int Y = 0;
        for(int j = 0; j < 6; j++) {
         store+=board[X+j][Y+j];    
         if(store.contains("xxxx") || store.contains("oooo")) {
         return true;
         }
        }
        store = "";
        
        X = 5;
        Y = 0;
            for(int j = 0; j < 6; j++) {
             store+=board[X-j][Y+j];    
             if(store.contains("xxxx") || store.contains("oooo")) {
             return true;
             }
            }
            store = "";
    
            X = 5;
            Y = 1;
                for(int j = 0; j < 6; j++) {
                 store+=board[X-j][Y+j];    
                 if(store.contains("xxxx") || store.contains("oooo")) {
                 return true;
                 }
                }
                store = ""; 
                
                X = 0;
                Y = 1;
                    for(int j = 0; j < 6; j++) {
                     store+=board[X+j][Y+j];    
                     if(store.contains("xxxx") || store.contains("oooo")) {
                     return true;
                     }
                    }
                    store = "";     
                
                        X = 0;
                        Y = 2;
                            for(int j = 0; j < 5; j++) {
                             store+=board[X+j][Y+j];    
                             if(store.contains("xxxx") || store.contains("oooo")) {
                             return true;
                             }
                            }
                            store = ""; 
                            
                            X = 0;
                            Y = 3;
                                for(int j = 0; j < 4; j++) {
                                 store+=board[X+j][Y+j];    
                                 if(store.contains("xxxx") || store.contains("oooo")) {
                                 return true;
                                 }
                                }
                                store = ""; 
                                
                                X = 5;
                                Y = 2;
                                    for(int j = 0; j < 5; j++) {
                                     store+=board[X-j][Y+j];    
                                     if(store.contains("xxxx") || store.contains("oooo")) {
                                     return true;
                                     }
                                    }
                                    store = ""; 
                                
                                    X = 5;
                                    Y = 3;
                                        for(int j = 0; j < 4; j++) {
                                         store+=board[X-j][Y+j];    
                                         if(store.contains("xxxx") || store.contains("oooo")) {
                                         return true;
                                         }
                                        }
                                        store = ""; 
                                        
                                        X = 1;
                                        Y = 0;
                                            for(int j = 0; j < 4; j++) {
                                             store+=board[X+j][Y+j];    
                                             if(store.contains("xxxx") || store.contains("oooo")) {
                                             return true;
                                             }
                                            }
                                            store = "";             
                                            
                                            X = 2;
                                            Y = 0;
                                                for(int j = 0; j < 4; j++) {
                                                 store+=board[X+j][Y+j];    
                                                 if(store.contains("xxxx") || store.contains("oooo")) {
                                                 return true;
                                                 }
                                                }
                                                store = "";         
                                                
                                                X = 2;
                                                Y = 6;
                                                    for(int j = 0; j < 4; j++) {
                                                     store+=board[X+j][Y-j];    
                                                     if(store.contains("xxxx") || store.contains("oooo")) {
                                                     return true;
                                                     }
                                                    }
                                                    store = "";     
                                                    
                                                    X = 2;
                                                    Y = 5;
                                                        for(int j = 0; j < 4; j++) {
                                                         store+=board[X+j][Y-j];    
                                                         if(store.contains("xxxx") || store.contains("oooo")) {
                                                         return true;
                                                         }
                                                        }
                                                        store = "";     
                                        
                                        
    return b;
    }   
 
    public static void main(String[] args) {
    MainFour game = new MainFour();
    Scanner scan = new Scanner(System.in);
    int l;
    int player = 1;
    
    System.out.println(game.showBoard());
    
    while(game.detectWin() == false) {
    System.out.println("Player " + player + "'s Turn!");    
    System.out.println("Place Piece at Location (1-7)");
    l = scan.nextInt();
    if(l < 1 || l > 7) {
    while(l < 1 || l > 7) {
    System.out.println("Invalid Option! Try Again!");   
    System.out.println("Place Piece at Location (1-7)");
    l = scan.nextInt(); 
    }
    }
    game.placePiece(l); 
    
    System.out.println(game.showBoard());
    if(player == 1) {
    player++;   
    }else {
    player--;
    }
    System.out.println("-------------------------------");
    }
    
    if(game.detectWin() == true) {
    if(player == 1) {  
    player = 3; 
    }
    System.out.println("You Win! Player " + (player-1));    
    }
    scan.close();
}
}