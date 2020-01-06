package com.mycompany.classicmodels.web.primefaces;

import com.mycompany.classicmodels.domain.enums.SortOrderPrime;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public abstract class GenericLazyDataModel<T> extends LazyDataModel<T> {

    private static final long serialVersionUID = 1137483646926904212L;

    abstract long count(Map<String, Object> filters);

    abstract List<T> fetch(Pageable pageable, Map<String, Object> filters);

    @Override
    public List<T> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {

        Pageable page = PageRequest.of(first / pageSize, pageSize); //TODO: Implement sort

        setRowCount((int) count(filters));

        return fetch(page, filters);

    }

    protected String getSortOrder(SortOrder sortOrder) {
        return SortOrderPrime.value(sortOrder).getDescription();
    }

}
