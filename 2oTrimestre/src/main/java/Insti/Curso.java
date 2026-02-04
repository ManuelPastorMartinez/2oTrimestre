package Insti;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}
