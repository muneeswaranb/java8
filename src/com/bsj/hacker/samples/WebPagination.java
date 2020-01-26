package com.bsj.hacker.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WebPagination {

    public static List<String> fetchItemsToDisplay(List<List<String>> items,
                                                   int sortParameter, int sortOrder, int itemPerPage, int pageNumber) {
// Write your code here
        if(pageNumber > items.size() / itemPerPage || sortParameter > 2 ||
                sortOrder > 1)
            return null;
        items = sortItems(items, sortParameter, sortOrder);
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < itemPerPage && ((pageNumber * itemPerPage + i) <
                items.size()); i++)
            result.add(items.get(pageNumber * itemPerPage + i).get(0));
        return result;
    }
    private static List<List<String>> sortItems(List<List<String>> items, int
            sortParameter, int sortOrder) {
        switch(sortParameter){
            case 0:
                if(sortOrder == 0)
                    Collections.sort(items, new Comparator<List<String>>() {
                        @Override
                        public int compare(List<String> o1, List<String> o2)
                        {
                            return
                                    o1.get(sortParameter).compareTo(o2.get(sortParameter));
                        }
                    });
                else
                    Collections.sort(items, new Comparator<List<String>>() {
                        @Override
                        public int compare(List<String> o1, List<String> o2)
                        {
                            return
                                    o2.get(sortParameter).compareTo(o1.get(sortParameter));
                        }
                    });
                break;
            case 1:
            case 2:
                if(sortOrder == 0)
                    Collections.sort(items, new Comparator<List<String>>() {
                        @Override
                        public int compare(List<String> o1, List<String> o2)
                        {
                            if(Integer.parseInt(o1.get(sortParameter)) >
                                    Integer.parseInt(o2.get(sortParameter)))
                                return 1;
                            return -1;
                        }
                    });
                else
                    Collections.sort(items, new Comparator<List<String>>() {
                        @Override
                        public int compare(List<String> o1, List<String> o2)
                        {
                            if(Integer.parseInt(o1.get(sortParameter)) <Integer.parseInt(o2.get(sortParameter)))
                                return 1;
                            return -1;
                        }
                    });
                break;
        }
        return items;
    }
}
}
