class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        st=[]
        res=set()
        for i in range(len(s)):
            if s[i]=='(':
                st.append(i)
            elif s[i]==')':
                if st:
                    st.pop()
                else:
                    res.add(i)
        while st:
            res.add(st.pop())
        ans=[]
        for i in range(len(s)):
            if i not in res:
                ans.append(s[i])
        return "".join(ans)




        