using System.ComponentModel.DataAnnotations;

namespace PersonalDiary.Models {
    public class Events {
        
        [Key]
        public int Id { get; private set; }

        [Required (ErrorMessage = "Este campo é obrigatório")]
        public string title { get; set; }

        [Required (ErrorMessage = "Este campo é obrigatório")]
        public string text { get; set; }

        public Events (string title, string text) {
            this.title = title;
            this.text = text;
        }

        public Events () {

        }

    }
}