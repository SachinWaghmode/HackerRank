public class WordBoggle {
	static String[] dict = {"QUIZ","GEEKS","FOR"};

	public static void main(String[] args) {
		
		char[][] boogle = {{'G','I','Z'},
							{'U','E','K'},
							{'Q','S','E'}};
		
		findWords(boogle);
	}
	
	public static void findWords(char [][] boogle ){
		
		boolean[][] visited = new boolean[3][3];
		
		String str = new String();
		str ="";
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				findDictWord(boogle, visited, i,j,str);	
			}
		}
	}
	
	public static void findDictWord(char[][] boogle, boolean[][] visited,int i,int j,String str){
		
		visited[i][j] = true;
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(str);
		sb1.append(boogle[i][j]);
		str = sb1.toString();
		
		if(isWord(str)){
			System.out.println(str);
		}
		
		for(int p=i-1; p<=i+1 && p<3; p++){
			for(int q=j-1; q<=j+1 && q<3; q++){
				if(p>=0 && q>=0 && !visited[p][q]){
				findDictWord(boogle, visited, p, q, str);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.deleteCharAt(str.length()-1);
		str = sb.toString();
		visited[i][j]= false;
		
	}
	
	public static boolean isWord(String str){
		
		for(int i=0; i<dict.length; i++){
			if(str.equalsIgnoreCase(dict[i])){
				return true;
			}
		}
		return false;
	}
}
