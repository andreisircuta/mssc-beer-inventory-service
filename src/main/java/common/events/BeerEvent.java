package common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent {
    static final long serialVersionUID = -5150782900858263339L;

    private BeerDto beerDto;

}
