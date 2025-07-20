package com.gopikrishna;

public class AboutMe {

    public static void main(String[] args) {
        printHeader();
        printSkills();
        printExperience();
    }

    private static void printHeader() {
        System.out.println("👋 Hello, I'm GopiKrishna");
        System.out.println("🌐 Cloud & DevOps Engineer | SRE | Infrastructure Automation");
        System.out.println("-------------------------------------------------------------\n");
    }

    private static void printSkills() {
        System.out.println("💡 Core Skills & Technologies:");
        System.out.println(" - ☁️ Cloud: GCP, Azure, AWS");
        System.out.println(" - 🧱 IaC: Terraform, ARM Templates, CloudFormation");
        System.out.println(" - 🔄 CI/CD: GitHub Actions, Azure DevOps, Jenkins, GitLab CI");
        System.out.println(" - 📦 Containers: Docker, Kubernetes (GKE, AKS), Helm");
        System.out.println(" - 📊 Monitoring: Prometheus, Grafana, ELK, Azure Monitor, Stackdriver");
        System.out.println(" - 🔐 Security: IAM, RBAC, SSL/TLS, Key Vault, Secrets Manager");
        System.out.println(" - 🔧 Scripting: Bash, Python, YAML");
        System.out.println(" - 🕸️ Networking: VPC, Load Balancer, NAT Gateway, Firewall Rules");
        System.out.println(" - 🧪 Testing: Smoke Tests, Canary Deployments, Chaos Engineering");
        System.out.println("\n  ");
    }

    private static void printExperience() {
        System.out.println("📌 Employment History:");

        System.out.println("\n🔹 Cloud & DevOps Engineer – HCL Technologies (2022 – Present)");
        System.out.println("   - Migrated enterprise workloads to GCP and Azure cloud platforms.");
        System.out.println("   - Designed and implemented CI/CD pipelines using GitHub Actions and Azure DevOps.");
        System.out.println("   - Managed GKE clusters with custom auto-scaling and observability setup.");
        System.out.println("   - Hardened infrastructure security with IAM, VPC peering, firewall, and policies.");

        System.out.println("\n  ");
        System.out.println("\n🔹 DevOps & DevOps Engineer – Wipro (2019 – 2022)");
        System.out.println("   - Provisioned cloud infrastructure using Terraform modules for multiple environments.");
        System.out.println("   - Integrated Jenkins and GitLab CI with containerized microservices.");
        System.out.println("   - Implemented centralized logging and monitoring with ELK and Prometheus stack.");
        System.out.println("   - Automated release and rollback strategies with blue/green and canary deployments.");

        System.out.println("\n  ");
        System.out.println("\n🔹 DevOps & DevOps Engineer – Data Glove India Pvt Ltd (2017 – 2019)");
        System.out.println("   - Managed Linux-based infrastructure, patching, backup, and user access control.");
        System.out.println("   - Built automation scripts in Bash for routine infra tasks and log rotation.");
        System.out.println("   - Collaborated with Dev teams to move legacy apps into Docker containers.");

        System.out.println("\n  ");
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("📨 Contact: nora.gopikrishna@gmail.com | 📍 Location: Hyderabad, India");
    }
}
