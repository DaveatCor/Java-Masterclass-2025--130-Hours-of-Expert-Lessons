package dev.lpa;

enum Geometry {
    LINE, POINT, POLYGON
}

enum Color {
    BLACK, BLUE, GREEN, ORANGE, RED
}

enum PointMarker {
    CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE
}

enum LineMarker {
    DAHSED, DOTTED, SOLID
}

public interface Mappable {
    String JSON_PROPERTY = """
            "peroperies": {%s}
            """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJson() {
        return """
                "type": "%s", "label": "%s, "marker": "%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }
}
