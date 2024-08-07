package co.ruppcstat.testbanking.Exception;

import lombok.Builder;

@Builder
public record FielErrorss(
        String field,
        String detail
) {
}
