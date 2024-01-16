from typing import List


def rotate_90(arr: List[List[int]]) -> List[List[int]]:
    return [list(i) for i in zip(*arr[::-1])]


def attach(sticker: List[List[int]]) -> bool:
    sticker_row, sticker_col = len(sticker), len(sticker[0])
    for check_notebook_row in range(notebook_row - sticker_row + 1):
        for check_notebook_col in range(notebook_col - sticker_col + 1):
            if can_attach(check_notebook_row, check_notebook_col, sticker_row, sticker_col, sticker):
                for check_sticker_row in range(sticker_row):
                    for check_sticker_col in range(sticker_col):
                        notebook[check_notebook_row + check_sticker_row][check_notebook_col + check_sticker_col] += sticker[check_sticker_row][check_sticker_col]
                return True
    return False


def can_attach(check_notebook_row: int, check_notebook_col: int, sticker_row: int, sticker_col: int, sticker: List[List[int]]) -> bool:
    for i in range(sticker_row):
        for j in range(sticker_col):
            if notebook[check_notebook_row + i][check_notebook_col + j] == 1 and sticker[i][j] == 1:
                return False
    return True


if __name__ == "__main__":
    notebook_row, notebook_col, count_of_sticker = map(int, input().split())
    notebook = [[0] * notebook_col for _ in range(notebook_row)]
    stickers = []

    for _ in range(count_of_sticker):
        r, c = map(int, input().split())
        sticker = [list(map(int, input().split())) for _ in range(r)]
        stickers.append(sticker)

    for sticker in stickers:
        for i in range(4):
            if attach(sticker):
                break
            sticker = rotate_90(sticker)

    print(sum(sum(v) for v in notebook))