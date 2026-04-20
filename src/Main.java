class ArrayStack
{
    private String[] stackArray;
    private int top;
    private int capacity;

    public ArrayStack(int size)
    {
        this.capacity = size;
        this.stackArray = new String[capacity];
        this.top = -1;
    }

    public boolean isFull()
    {
        return top == capacity - 1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean add(String element)
    {
        if (isFull())
        {
            System.out.println("Не вдалося додати '" + element + "': Стек переповнений!");
            return false;
        }
        stackArray[++top] = element;
        return true;
    }

    public String delete()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Помилка: Спроба видалення з порожнього стека!");
        }
        return stackArray[top--];
    }

    public void printStack()
    {
        if (isEmpty())
        {
            System.out.println("Стек порожній.");
            return;
        }
        System.out.print("Вміст стека: ");
        for (int i = top; i >= 0; i--)
        {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Створення екземпляра структури даних: ");
        ArrayStack stack = new ArrayStack(5);

        System.out.println("\nДодавання елементів: ");
        stack.add("10");
        System.out.println("Елемент '10' додано.");
        stack.add("25");
        System.out.println("Елемент '25' додано.");
        stack.add("42");
        System.out.println("Елемент '42' додано.");

        stack.printStack();

        System.out.println("\nВидалення декількох елементів: ");
        try
        {
            System.out.println("Видалено елемент: " + stack.delete());
            System.out.println("Видалено елемент: " + stack.delete());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nВміст після видалення:");
        stack.printStack();
    }
}
