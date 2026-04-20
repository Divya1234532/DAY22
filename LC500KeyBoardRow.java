class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String st=words[i].toLowerCase();
            boolean inr1=true;
            boolean inr2=true;
            boolean inr3=true;
            for(int j=0;j<st.length();j++)
            {
                char ch=st.charAt(j);
                if(r1.indexOf(ch)==-1)inr1=false;
                if(r2.indexOf(ch)==-1)inr2=false;
                if(r3.indexOf(ch)==-1)inr3=false;
            }
            if(inr1||inr2||inr3)
            {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
