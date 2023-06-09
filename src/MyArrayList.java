public class MyArrayList<T> implements MyList{
    private T[] arr;
    private int size;
    public MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 5;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object item) {
        if (size == arr.length){
            T[] newArr = (T[]) new Object[arr.length*2];
            for (int i=0; i< arr.length; i++){
                newArr[i] = arr[i];
            }
            arr=newArr;
        }
        arr[size++]=(T) item;
    }


    @Override
    public void add(Object item, int index) {
        checkIndex(index);
        if (size == arr.length){
            T[] newArr = (T[]) new Object[arr.length*2];
            for(int i=0; i<size; i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        for (int i = size - 1; i>=index; i--){
            arr[i + 1]=arr[i];
        }
        arr[index]=(T)item;
        size++;
    }


    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

}
