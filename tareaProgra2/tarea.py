class Anime:
    def __init__(self, nombre, genero, nroEpisodios):
        self.nombre = nombre
        self.genero = genero
        self.nroEpisodios = nroEpisodios
        self.episodios = []

    def __str__(self):
        return f"Anime: {self.nombre}, Género: {self.genero}, Episodios: {self.nroEpisodios}"


class Televisor:
    def __init__(self, marca="", resolucion=0, tipo=""):
        self.marca = marca
        self.resolucion = resolucion
        self.tipo = tipo

    def __str__(self):
        return f"Televisor: {self.marca}, Resolución: {self.resolucion}p, Tipo: {self.tipo}"


class Instrumento:
    def __init__(self, nombre, material, tipo):
        self.nombre = nombre
        self.material = material
        self.tipo = tipo

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def __str__(self):
        return f"Instrumento: {self.nombre}, Material: {self.material}, Tipo: {self.tipo}"


if __name__ == "__main__":
    anime1 = Anime("Naruto", "Acción", 220)
    anime2 = Anime("One Piece", "Aventura", 1000)

    tv1 = Televisor("Samsung", 1080, "LED")
    tv2 = Televisor("LG", 4, "OLED")

    inst1 = Instrumento("Guitarra", "Madera", "Cuerda")
    inst2 = Instrumento("Flauta", "Metal", "Aire")

    print(anime1)
    print(anime2)
    print(tv1)
    print(tv2)
    print(inst1)
    print(inst2)