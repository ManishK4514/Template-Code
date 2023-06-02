// Left ( >= target)
public int search1(ArrayList<Integer> list, int target){
    int l = 0, h = list.size() - 1;
    while(l <= h){
        int mid = l + (h - l)/2;
        if(list.get(mid) >= target) h = mid - 1;
        else l = mid + 1;
    }
    return l;
}

// Right ( <= target)
public int search2(ArrayList<Integer> list, int target){
    int l = 0, h = list.size() - 1;
    while(l <= h){
        int mid = l + (h - l)/2;
        if(list.get(mid) <= target) l = mid + 1;
        else h = mid - 1;
    }
    return h;
}
