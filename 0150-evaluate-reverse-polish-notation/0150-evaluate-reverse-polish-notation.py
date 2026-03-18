class Solution:
    def evalRPN(self, token: List[str]) -> int:
        st = []

        for t in token:
            if t == "+":
                b = st.pop()
                a = st.pop()
                st.append(a + b)

            elif t == "-":
                b = st.pop()
                a = st.pop()
                st.append(a - b)

            elif t == "*":
                b = st.pop()
                a = st.pop()
                st.append(a * b)

            elif t == "/":
                b = st.pop()
                a = st.pop()
                st.append(int(a / b))  # truncates toward 0

            else:
                st.append(int(t))

        return st[-1]