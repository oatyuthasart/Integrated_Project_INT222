package sit.int221.oasipserver.dtos.event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageEventDto {
    private List<SimpleEventDto> content;
    private int number;
    private int size;
    private int totalPages;
    private int numberOfElements;
    private int totalElements;
    private boolean last;
    private boolean first;
}
