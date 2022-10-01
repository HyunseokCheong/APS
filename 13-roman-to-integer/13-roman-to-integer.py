class Solution:
    def romanToInt(self, s: str) -> int:
        new_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        new_list = []
        for i in s:
            new_list.append(new_dict[i])
        for i in range(len(new_list) - 1):
            if new_list[i] < new_list[i + 1]:
                new_list[i] = -new_list[i]
        return sum(new_list)