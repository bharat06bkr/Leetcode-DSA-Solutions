class Solution 
{
    // well tried bharat passed 63/65 on the first attempt lets learn about optimal versiond
    // You have to learn trie implenmentation
    // boolean found;
    // public List<String> findWords(char[][] board, String[] words) 
    // {
    //     List<String> result=new ArrayList<>();
    //     for(String word:words)
    //     {
    //         for(int i=0;i<board.length;i++)
    //         {
    //             boolean b=false;
    //             for(int j=0;j<board[0].length;j++)
    //             {
    //                 if(board[i][j]==word.charAt(0))
    //                 {
    //                     found=false;
    //                     find(i,j,board,0,word,new boolean[board.length][board[0].length]);
    //                     if(found)
    //                     {
    //                         result.add(word);
    //                         b=true;
    //                         break;
    //                     }
    //                 }
    //             }
    //             if(b)   break;
    //         }
    //     }
    //     return result;
    // }
    // public void find(int row,int col,char mat[][],int index,String word,boolean visited[][])
    // {
    //     if(found)   
    //         return;
    //     if(index==word.length())
    //     {
    //         found=true;
    //         return;
    //     }
    //     if(row<0 || col<0 || row>=mat.length || col>=mat[0].length || mat[row][col]!=word.charAt(index) || visited[row][col])
    //         return;        
    //     visited[row][col]=true;
    //     find(row-1,col,mat,index+1,word,visited);
    //     find(row+1,col,mat,index+1,word,visited);
    //     find(row,col-1,mat,index+1,word,visited);
    //     find(row,col+1,mat,index+1,word,visited);
    //     visited[row][col]=false;
    // }

    public List<String> findWords(char[][] board, String[] words) {
    List<String> res = new ArrayList<>();
    TrieNode root = buildTrie(words);
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            dfs (board, i, j, root, res);
        }
    }
    return res;
}

public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
    char c = board[i][j];
    if (c == '#' || p.next[c - 'a'] == null) return;
    p = p.next[c - 'a'];
    if (p.word != null) {   // found one
        res.add(p.word);
        p.word = null;     // de-duplicate
    }

    board[i][j] = '#';
    if (i > 0) dfs(board, i - 1, j ,p, res); 
    if (j > 0) dfs(board, i, j - 1, p, res);
    if (i < board.length - 1) dfs(board, i + 1, j, p, res); 
    if (j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
    board[i][j] = c;
}

public TrieNode buildTrie(String[] words) {
    TrieNode root = new TrieNode();
    for (String w : words) {
        TrieNode p = root;
        for (char c : w.toCharArray()) {
            int i = c - 'a';
            if (p.next[i] == null) p.next[i] = new TrieNode();
            p = p.next[i];
       }
       p.word = w;
    }
    return root;
}

class TrieNode {
    TrieNode[] next = new TrieNode[26];
    String word;
}
}