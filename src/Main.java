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

    public void set(String element)
    {
        if (top == capacity - 1)
        {
            System.out.println("Помилка: Стек переповнений!");
        } else
        {
            stackArray[++top] = element;
        }
    }

    public String delete()
    {
        if (isEmpty())
        {
            System.out.println("Помилка: Стек порожній!");
            return null;
        } else
        {
            return stackArray[top--];
        }
    }

    public boolean isEmpty()
    {
        return top == -1;
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
        System.out.println("Створення екземпляра структури даних:");
        ArrayStack stack = new ArrayStack(5);

        System.out.println("\nДодавання елементів:");
        stack.set("10");
        stack.set("25");
        stack.set("42");
        stack.set("99");
        stack.set("108");

        stack.printStack();

        System.out.println("\nВидалення декількох елементів:");
        String removed1 = stack.delete();
        System.out.println("Видалено елемент: " + removed1);

        String removed2 = stack.delete();
        System.out.println("Видалено елемент: " + removed2);

        System.out.println("\nВміст після видалення: ");
        stack.printStack();
    }
}
