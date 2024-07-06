public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
    ArrayList<E> newList = new ArrayList<>();
    for (E element : list) {
        if (!newList.contains(element)) {
            newList.add(element);
        }
    }
    return newList;
}
