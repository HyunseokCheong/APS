def solution(X, Y, D):
    return (Y - X) // D + 1 if (Y - X) % D else (Y - X) // D
