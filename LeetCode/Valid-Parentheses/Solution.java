class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack=[]
        bracket_map={')':'(', '}':'{', ']':'['}
        for i in s:
            if i in bracket_map:
                top=stack.pop() if stack else '#'
                if bracket_map[i]!=top:
                    return False
            else:
                stack.append(i)
        return not stack

        