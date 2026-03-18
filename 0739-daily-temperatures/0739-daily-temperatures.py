class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        st=[]
        ar=[0]* len(temperatures)
        for i in range (len(temperatures)):
            c=0
            while st and temperatures[st[-1]]< temperatures[i]:
                id=st.pop()
                ar[id]=i-id
            st.append(i)
            
        return ar


        