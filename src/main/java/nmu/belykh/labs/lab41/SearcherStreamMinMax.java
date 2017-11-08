package nmu.belykh.labs.lab41;


public class SearcherStreamMinMax {
    private int lengthLists;

    public void setLength(StreamListsOfNum listOfNum) {
        this.lengthLists = listOfNum.getLength();
    }

    public Integer getMaximum(StreamListsOfNum listOfNum) {
        lengthLists =listOfNum.getLength();
        for (int i = 1; i < lengthLists; i++){
            listOfNum.getRandomLists().get(0).addAll(listOfNum.getRandomLists().get(i));
        }
        Integer max = listOfNum.getRandomLists().get(0).stream().max(Integer::compareTo).get();
        System.out.println("Max: " + max);
        return max;
    }

    public Integer getMinimum(StreamListsOfNum listOfNum) {
        lengthLists =listOfNum.getLength();
        for (int i = 1; i < lengthLists; i++){
            listOfNum.getRandomLists().get(0).addAll(listOfNum.getRandomLists().get(i));
        }
        Integer min = listOfNum.getRandomLists().get(0).stream().min(Integer::compareTo).get();
        System.out.println("Min: " + min);
        return min;
    }
}