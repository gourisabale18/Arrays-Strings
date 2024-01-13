//Reverse Words of string
the sky is blue
//blue is sky the
class ReverseWords {
    public String reverseWords(String s) {
        
        //Java solution using 2 pointers

        //remove leading and trailing spaces
        s=s.trim();
        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            int end=i;
            while(i>=0 && s.charAt(i)!=' ')
            {
                i--;
            }
            //i the character is whitespace
            //the start of word would be next after i
            String word=s.substring(i+1,end+1); //goes till lastIndex-1 position
            //if word is empty,dont append
            if(word.equals(""))
                 continue;
            sb.append(word).append(" ");

        }
        //remove extra trailing space after final word
        return sb.toString().trim();// return reverse words in string
    }
}
