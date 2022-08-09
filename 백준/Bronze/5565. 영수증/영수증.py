price = int(input())
books = []

for i in range(9):
    book = int(input())
    books.append(book)

answer = price - sum(books)

print(answer)